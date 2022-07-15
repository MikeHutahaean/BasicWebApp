package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Mikhael";
        } else if  (query.contains("largest")){
            return "832";
        } else if (query.contains("plus")){
           int i = query.indexOf("plus");
           int j = query.indexOf("is");
           j+=2;
           int k = query.indexOf("?");
           String zahl1 = query.substring(j,i);
           i+=4;
           String zahl2= query.substring(i,k);
           int zahl3 = Integer.parseInt(zahl1) + Integer.parseInt(zahl2);
           return String.valueOf(zahl3);

        }

         else { // TODO extend the programm here
            return "";
        }
    }
}
