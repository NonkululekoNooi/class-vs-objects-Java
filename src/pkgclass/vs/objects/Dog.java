
package pkgclass.vs.objects;


class Dog {
    
    //what dog can do
    boolean sleeping =false;
    boolean walking = false;
    boolean barking = false;
    
    //CREATING A CONSTRUCTOR FOR DIFFERENT NAMES OF THE DOG
    String nameOfDog;

    public Dog(String nameOfDog) {
        this.nameOfDog = nameOfDog;
    }
    
  
    //method or functions
    void walk(){
    
    //calling a variable that you declared
    walking = true;
    sleeping = false;
    barking =false;
      
    }

     void sleeping(){
    
    //calling a variable that you declared
    walking = false;
    sleeping = true;
    barking =false;
    }
    
     
      void barking(){
    
    //calling a variable that you declared
    walking = true;
    sleeping = false;
    barking =true;
    }
}
