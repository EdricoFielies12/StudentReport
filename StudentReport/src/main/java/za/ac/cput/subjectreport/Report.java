/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.subjectreport;

/**
 *
 * @author Breyton Ernstzen - 217203027
 */
public class Report {
    private String studName,studSurname,course;
    private long studNum;
    private int averageMark;
    
    public boolean CellNumberVerifier (String cellNumber)
    {

        boolean isCellNumberValid = true;
        if(cellNumber == null)
        {
           isCellNumberValid = false;
        }
        else 
        {
            if (isCellLengthValid(cellNumber)) 
            {
                for (int i = 0; i < cellNumber.length(); i++) 
                {
                    char character = cellNumber.charAt(i);
                    if(!(Character.isDigit(character))) isCellNumberValid = false;
                }
            }else { isCellNumberValid = false; }
        } 
        return isCellNumberValid;
    }
    
    private static boolean isCellLengthValid(String cell)
    {
        if(cell.length() == 10) return true;
        else return false;
    }
      
    public void setName(String name){
        this.studName = name;
    }
    public String getName(){
        return studName;
    }
    public void setSurname(String surname){
        this.studSurname = surname;
    }
    public String getSurname(){
        return studSurname;
    }
    public void setStudentNumber(long studentNumber){
        this.studNum = studentNumber;
    }
    public long getStudentNumber(){
        return studNum;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }
    public void setAverageMark(int averageMark){
        this.averageMark = averageMark;
    }
    public int getAverageMark(){
        return averageMark;
    }
    public String toString(){
        String str = String.format("");
        return str;
    }
}