package javaapplication.features;

 class ExampleObject {

     public static void main(String[]args){
         Student st = new Student();
         st.id = 10;
         st.name = "hasib ferdous";
         st.Display();
     }
}
 class Student {
     int id;
     String name;
     void Display(){
         System.out.println("ID & Name:" +id +name);
     }
        
}
