package fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import java.util.LinkedList;
import java.util.List;


@Dependent
@Stateless
public class FizzBuzzService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzService.class);

    public List<Integer> split(String numbers)  {

        if(numbers == null || numbers.isEmpty()){
            throw new IllegalArgumentException("you should provide input");
        }

        
        for(int i =0;i<numbers.length();i++){
             if(!Character.isDigit( numbers.charAt(i)) && numbers.charAt(i)!=' '){
                 throw new IllegalArgumentException("you should provide input as numbers");
             }
        }


        String[] splitted = numbers.split(" ");
        List<Integer> splittedNumbers = new LinkedList<>();
        for(String s : splitted){
            s = s.trim();
            if(!s.equals("")){
                splittedNumbers.add(Integer.valueOf(s));
            }
        }

        return splittedNumbers;
    }

    public String processNumbers(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        for (Integer tmp : numbers) {
            if (tmp % 15 == 0) {
                sb.append("FizzBuzz ");
            } else if (tmp % 3 == 0) {
                sb.append("Fizz ");
            } else if (tmp % 5 == 0) {
                sb.append("Buzz ");
            } else {
                sb.append(tmp + " ");
            }
        }

        return sb.toString();
    }




}
