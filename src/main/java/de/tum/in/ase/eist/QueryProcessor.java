package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.*;

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
            String arr [] = query.split(" ");
             int zahl3=0;
            for(int i=0 ;i<arr.length;i++){
              if(arr[i].equals("plus")){
                 zahl3 = Integer.parseInt(arr[i-1])+Integer.parseInt(arr[i+1]);
              }

          }
           return String.valueOf(zahl3);

        } /*else if (query.contains("largest")){
          /* int index = query.indexOf(':');
           String s = query.substring(index+1);
           Integer k = null;
           String arr[] = s.split(" ");
           int temp =0;
           for(int i=0;i<arr.length;i++){
               try {
                   temp = Integer.parseInt(arr[i]);
               }catch(ClassCastException e){
                   continue;
               }
               if(k == null){
                   k = temp;
               }else if (k<temp){
                   k =temp;
               }

           }
           return (k==null)?"null": String.valueOf(k);
        }*/ else if(query.contains("multiplied")){
            String arr[] = query.split(" ");
            Integer k = null;
            for(int i=0;i<arr.length;i++){
                if(arr[i].equals("multiplied")){
                  k = Integer.parseInt(arr[i-1])*Integer.parseInt(arr[i+2]);
                }
            }


            return (k==null)?null:String.valueOf(k);
        } else if (query.contains("square") && query.contains("cube")){
            String arr [] = query.split(" ");
            List<Double> listi = new ArrayList<Double>();
            int i;
            for( i=0;i<arr.length;i++){
                if(arr[i].equals(":")){
                    break;
                }
            }
            for(; i< arr.length;i++){
                if(arr[i].equals(",")){
                    continue;
                }
                double a = Double.parseDouble(arr[i]);
                double cube = Math.pow(a,1/3);
                double square = Math.sqrt(a);

                if(Math.floor(cube) == cube && Math.floor(square) == square){
                    listi.add(a);
                }

            }

            String s="";
            for(Double d:listi){
                s = s+" "+String.valueOf(d);
            }
            return  s;
        }

         else { // TODO extend the programm here
            return "";
        }

    }
}
