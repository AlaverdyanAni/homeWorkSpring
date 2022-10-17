package Controller;

import Service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@RestController

@RequestMapping("/order")

public class BasketContoller {
    private final BasketService basketService;

    public BasketContoller(BasketService basketService) {
        this.basketService = basketService;
    }
    @GetMapping(path = "/add")
    public void addProducts(@RequestParam(name = "ids") List<Integer> productsIds){
        basketService.add(productsIds);
    }
    @GetMapping(path = "/get")
    public Object getProducts(){
        return basketService.get();
    }

}
