package com.mycompany.calculator;
import java.io.*;
class SimpleInputManager{
    String text;
    String BufferedInput(){
        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in)))
        {
            text = br.readLine();
        }
        catch(IOException ex)
        {   
            System.err.println(ex.getMessage());
        }
        return(text);
    }
}
class ConvertRomeToArabic{
    String[] roman = {"VIII", "IX", "III", "VII", "VI", "IV", "V", "II", "X", "I"};
    String[] arab = {"8", "9", "3", "7", "6", "4", "5", "2", "10", "1"};
    int check = -1, counterer, counterFor,counterForTwicePart,i = 0;
    boolean RomeChecker = false;
    String FirstPart,TwicePart;
    boolean ChekerWhatIsLanguage(String text){
        try{
            for(counterFor = 0;counterFor < 10;counterFor++){
                if(check == -1){
                    check = text.indexOf(roman[counterFor]);
                }
                if (check != -1){
                        RomeChecker = true;
                        break;
                }
            }
        }
        catch(RuntimeException ex){
            System.err.print("Bad input, check values");
        }
        return(RomeChecker);
    }
    String Convert(String text){
        try{
            counterer = 10;
            for(counterForTwicePart = 0;counterForTwicePart <= 2;counterForTwicePart++){  
                for(counterFor = 0;counterFor <= 9;counterFor++){
                    if((text.indexOf(roman[i])) != -1){
                        check = -1;
                        text = text.replaceFirst(roman[i],arab[i]);
                        counterer--;
                        break;
                    }
                    i++;
                    if (i == 10){
                        i = 0;
                    }
                }
            }
            if(counterer == 9){
                System.out.println("One of numbers have another Language");
                System.exit(0);
            }
        }
        catch(RuntimeException ex){
            System.err.println("Input value does not match <<Number Operation Number>>, or bigger then 2-nd number");
            System.exit(0);
        }
        return(text);
    }
}
class AllOperationsOnCalc{ 
    String TwicePiece;
    int FirstPiece, ThirdPiece, Answer;
    int ThreePiecesOfArephmetic(String text){
        try{
            if(text.substring(1,2).equals("0")){
                FirstPiece = Integer.parseInt(text.substring(0,2).trim());
                TwicePiece = text.substring(3,4).trim();
                ThirdPiece = Integer.parseInt(text.substring(5).trim());
            }
            else if(!text.substring(1,2).equals("0")){
                FirstPiece = Integer.parseInt(text.substring(0,1).trim());
                TwicePiece = text.substring(2,3).trim();
                ThirdPiece = Integer.parseInt(text.substring(4).trim());
            }
            switch(TwicePiece){
                case"+":
                    if((FirstPiece < 1)||(FirstPiece > 10)||(ThirdPiece < 1)||(ThirdPiece > 10)){
                        System.out.print("Worth number");
                        System.exit(0);
                    }
                    else{
                        Answer = FirstPiece + ThirdPiece;
                    }
                break;    
                case"-":
                    if((FirstPiece < 1)||(FirstPiece > 10)||(ThirdPiece < 1)||(ThirdPiece > 10)){
                        System.out.print("Worth number");
                        System.exit(0);
                    }
                    else{
                        Answer = FirstPiece - ThirdPiece;
                    }
                break;    
                case"*":
                    if((FirstPiece < 1)||(FirstPiece > 10)||(ThirdPiece < 1)||(ThirdPiece > 10)){
                        System.out.print("Worth number");
                        System.exit(0);
                    }
                    else{
                        Answer = FirstPiece * ThirdPiece;
                    }
                break;    
                case"/":
                    if((FirstPiece < 1)||(FirstPiece > 10)||(ThirdPiece < 1)||(ThirdPiece > 10)){
                        System.out.print("Worth number");
                        System.exit(0);
                    }
                    else{
                        Answer = FirstPiece / ThirdPiece;
                    }
                break;    
                default:
                    System.err.print("Worth number");
                    System.exit(0);
                break;
            }
        }
        catch(RuntimeException ex){
            System.err.println("Check input values: "+ex);
            System.exit(0);
        }
        return(Answer);    
    }
}
class IfRomeConvertAnswer extends ConvertRomeToArabic{
    String ConvertAnswer(Boolean RomeChecker, int AnswerINT){
        String AnswerSTR = null,AnswerFor = Integer.toString(AnswerINT).trim();
        if(RomeChecker == true){
            if(AnswerINT == 100){
                AnswerSTR = "C";
            }
            else if(AnswerINT == 90){
                AnswerSTR = "XC";
            }
            else if(AnswerINT >= 80){
                AnswerSTR = "LXXX";
                if(AnswerINT > 80){
                    AnswerFor = AnswerFor.substring(1,2).trim();
                    for(i = 0;i <= 9;i++){
                        AnswerFor = AnswerFor.replaceFirst(arab[i],roman[i]);
                    }
                    AnswerSTR = AnswerSTR + AnswerFor;
                }
            }
            else if(AnswerINT >= 70){
                AnswerSTR = "LXX";
                if(AnswerINT > 70){
                    AnswerFor = AnswerFor.substring(1,2).trim();
                    for(i = 0;i <= 9;i++){
                        AnswerFor = AnswerFor.replaceFirst(arab[i],roman[i]);
                    }
                    AnswerSTR = AnswerSTR + AnswerFor;
                }
            }
            else if(AnswerINT >= 60){
                AnswerSTR = "LX";
                if(AnswerINT > 60){
                    AnswerFor = AnswerFor.substring(1,2).trim();
                    for(i = 0;i <= 9;i++){
                        AnswerFor = AnswerFor.replaceFirst(arab[i],roman[i]);
                    }
                    AnswerSTR = AnswerSTR + AnswerFor;
                }
            }
            else if(AnswerINT >= 50){
                AnswerSTR = "L";
                if(AnswerINT > 50){
                    AnswerFor = AnswerFor.substring(1,2).trim();
                    for(i = 0;i <= 9;i++){
                        AnswerFor = AnswerFor.replaceFirst(arab[i],roman[i]);
                    }
                    AnswerSTR = AnswerSTR + AnswerFor;
                }
            }
            else if(AnswerINT >= 40){
                AnswerSTR = "XL";
                if(AnswerINT > 40){
                    AnswerFor = AnswerFor.substring(1,2).trim();
                    for(i = 0;i <= 9;i++){
                        AnswerFor = AnswerFor.replaceFirst(arab[i],roman[i]);
                    }
                    AnswerSTR = AnswerSTR + AnswerFor;
                }
            }
            else if(AnswerINT >= 30){
                AnswerSTR = "XXX";
                if(AnswerINT > 30){
                    AnswerFor = AnswerFor.substring(1,2).trim();
                    for(i = 0;i <= 9;i++){
                        AnswerFor = AnswerFor.replaceFirst(arab[i],roman[i]);
                    }
                    AnswerSTR = AnswerSTR + AnswerFor;
                }
            }
            else if(AnswerINT >= 20){
                AnswerSTR = "XX";
                if(AnswerINT > 20){
                    AnswerFor = AnswerFor.substring(1,2).trim();
                    for(i = 0;i <= 9;i++){
                        AnswerFor = AnswerFor.replaceFirst(arab[i],roman[i]);
                    }
                    AnswerSTR = AnswerSTR + AnswerFor;
                }
            }
            else if(AnswerINT >= 10){
                AnswerSTR = "X";
                if(AnswerINT > 10){
                    AnswerFor = AnswerFor.substring(1,2).trim();
                    for(i = 0;i <= 9;i++){
                        AnswerFor = AnswerFor.replaceFirst(arab[i],roman[i]);
                    }
                    AnswerSTR = AnswerSTR + AnswerFor;
                }
            }
            else if(AnswerINT < 10){
                if(AnswerINT > 0){
                    AnswerFor = AnswerFor.substring(0,1).trim();
                    for(i = 0;i <= 9;i++){
                        AnswerFor = AnswerFor.replaceFirst(arab[i],roman[i]);
                    }
                    AnswerSTR = AnswerFor;
                }
            }
        }
        else if (RomeChecker == false){
            AnswerSTR = Integer.toString(AnswerINT);
        }
        return(AnswerSTR);
    }
}
public class main {
    public static void main(String[] args) {
        String Inputter;
        int AfterSolve;
        Boolean chekerLang;
        SimpleInputManager SIM = new SimpleInputManager();
        AllOperationsOnCalc AOOC = new AllOperationsOnCalc();
        ConvertRomeToArabic CTR = new ConvertRomeToArabic();
        IfRomeConvertAnswer IRCA = new IfRomeConvertAnswer();
        System.out.println("Input: ");
        Inputter = SIM.BufferedInput();
        chekerLang = CTR.ChekerWhatIsLanguage(Inputter);
        Inputter = CTR.Convert(Inputter);
        System.out.println("Output: ");
        AfterSolve = AOOC.ThreePiecesOfArephmetic(Inputter);  
        Inputter = IRCA.ConvertAnswer(chekerLang,AfterSolve);
        System.out.println(Inputter);
    } 
}

