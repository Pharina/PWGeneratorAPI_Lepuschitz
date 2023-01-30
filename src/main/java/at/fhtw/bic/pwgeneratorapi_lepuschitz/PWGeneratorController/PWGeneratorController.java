package at.fhtw.bic.pwgeneratorapi_lepuschitz.PWGeneratorController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class PWGeneratorController {
   @GetMapping("api/pwlength")
    public String passwordLength(@RequestParam char password) {
       if(password == 1){
           return "A";
       } else if (password == 2) {
           return "BC";
       } else if (password == 3) {
           return "FGH";
       } else if (password == 0) {
           return "";
       } else return "No valid input";

   }

}

