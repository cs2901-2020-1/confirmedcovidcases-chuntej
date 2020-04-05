package cs_utec.cs2901.controller;

import cs_utec.cs2901.business.DailyCasesBusiness;
import cs_utec.cs2901.data.DailyCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dailycases")
public class DailyCasesController {

    @Autowired
    private DailyCasesBusiness business;

    //create
    @PostMapping("/")
    public DailyCases create (@RequestBody DailyCases item){
        return business.create(item);
    }

    //read
    @GetMapping("/")
    public List<DailyCases> read (){
        return business.findAll();
    }

    //update
    @PutMapping("/{id}")
    public DailyCases update(
            @PathVariable Long id,
            @RequestBody DailyCases item
    ){
        return business.update(item);
    }

    //delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        business.delete(id);
    }

}
