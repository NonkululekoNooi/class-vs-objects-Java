
package pkgclass.vs.objects;


public class ClassVsObjects {

   
    public static void main(String[] args) {
        
        //creating class for dog
        //you need to create a class to the dog methods, functions or things that a dog can do
        Dog fluffy = new Dog("fluffy");
        Dog Browny = new Dog("Browny");
        
         
         //creating an method that doesn't exist
         printStateOfDog(fluffy);
          System.out.println("THIS IS FOR BROWNY NOT FLUFFY");
         printStateOfDog(Browny);
        
         
         
         //you will get an error then click create methods
         
    }

    private static void printStateOfDog(Dog nameOfDog) {
        
          //giving instruction to fluffy by calling the method or function from the class we created
          nameOfDog.walk();
        
        //USING IF STATEMENT TO TEST
        
        if(nameOfDog.walking == true){
            System.out.println("THE DOG IS WALKING");
        }else{
            System.out.println("THE DOG IS NOT WALKING");
        }
        
         nameOfDog.barking();
         if(nameOfDog.barking == true){
            System.out.println("THE DOG IS BARKING AND WALKING");
        }else{
            System.out.println("THE DOG IS NOT WALKING AND BARKING");
        }
         
           nameOfDog.sleeping();
         if(nameOfDog.sleeping == true){
            System.out.println("THE DOG IS SLEEPING");
        }else{
            System.out.println("THE DOG IS NOT WALKING AND BARKING");
            
        }
         
         
        
      
        
         
         
         
    }
    
    
       
      
         
        
    
}
