package ie.atu.week3cicd1;

import org.springframework.web.bind.annotation.*;

@RestController
public class Calculator {
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        switch(operation){
            case "add":
                int answer = num1 + num2;
                return "{\"operation\": \"" + operation + "\", \"total\": " + answer + "}";
            case "subtract":
                answer = num1 - num2;
                return "{\"operation\": \"" + operation + "\", \"total\": " + answer + "}";
            case "multiply":
                answer = num1 * num2;
                return "{\"operation\": \"" + operation + "\", \"total\": " + answer + "}";
            case "divide":
                if(num2 == 0){
                    return "Error: Math error";
                }
                answer = num1 / num2;
                return "{\"operation\": \"" + operation + "\", \"total\": " + answer + "}";
            default:
                break;
        }
        return operation;
    }
}
