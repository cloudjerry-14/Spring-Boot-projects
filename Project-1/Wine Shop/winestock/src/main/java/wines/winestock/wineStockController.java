package wines.winestock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class wineStockController {

    List<winestockEntity> liquorsList=new ArrayList<>();

    @GetMapping("/index")
    public String displayLiqour(Model model){
        model.addAttribute("index", liquorsList);
        return "index";
    }

    @GetMapping("/")
    public String addStocks(Model model, @RequestParam(required = false) String id) {
        int index = getLiqourIndex(id);
        model.addAttribute("wine", index == wineStockConstants.NOT_FOUND ? new winestockEntity() : liquorsList.get(index));
        return "addStock";
    }

    @PostMapping("/handleSubmit")
    public String updateStock(winestockEntity stock){
        int index = getLiqourIndex(stock.getId());
        if (index == wineStockConstants.NOT_FOUND) {
            liquorsList.add(stock);
        } else {
            liquorsList.set(index, stock);
        }      
        return "redirect:/index";        
    }

    public int getLiqourIndex(Object object) {
        for (int i = 0; i < liquorsList.size(); i++) {
            if (liquorsList.get(i).getId().equals(object)) return i;
        }
        return wineStockConstants.NOT_FOUND;
    }
}
