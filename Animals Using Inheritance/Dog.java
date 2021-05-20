/**
 * @author (Atharva Manjrekar) 
 * @version (1.0)
 */
public class Dog implements Animal
{
    String name;
    String type;
    String say;
    static Size size;
    boolean jump;

    public Dog(String n, Size s, String sound){
        name = n;
        say = sound;
        size = s;
        type = "Dog";
    }

    public String toString(){
        return "Cat:\nName:"+name+"\nType:"+type+"\nSays:"+say+"\nCan Jump? "+jump+"";
    }

    public int compareTo(Size s){
        if (this.size == Size.SMALL){
            if (s == Size.SMALL)
                return 0;
            return -1; 
        }
        if (this.size == Size.MEDIUM){
            if (s == Size.SMALL)
                return 1;            
            if (s == Size.MEDIUM)
                return 0;           
            return -1;
        }
        if (this.size == Size.LARGE){
            if (s == Size.SMALL)
                return 1;                      
            if (s == Size.MEDIUM)
                return 1;          
            if (s == Size.LARGE)
                return 0;                
            if (s == Size.XL)
                return -1;                    
        }
        if (this.size == Size.XL){
            if (s == Size.XL)
                return 0;             
            return 1;
        }
        return 0;
    }

    public String speak(){
        String s = (""+name+" the "+type+" says "+say+"");
        return s;
    }

    public void chase(Animal a){
        if (this == a)
            System.out.println(""+name+" the "+type+" is trying to chase itself.");
        else if (this.compareTo(a.getSize()) <= 0)
            System.out.println(""+name+" the "+type+" tries to chase "+a.getName()+" the "+a.getType()+" but fails.");
        else
            System.out.println(""+name+" the "+type+" successfully chases "+a.getName()+" the "+a.getType()+".");    
    }

    public void chase(Animal a, Animal b){
        if (this.size == Size.XL)
            System.out.println(""+name+" the "+type+" successfully chases "+a.getName()+" the "+a.getType()+" and "+b.getName()+" the "+b.getType()+" ");
        else
            System.out.println(""+name+" the "+type+" is too small to chase multiple animals");
    }

    public void jump(Animal a)    {
        if (this.canJump() == true){
            if (this == a)
                System.out.println(""+name+" the "+type+" does a backflip");
            else 
                System.out.println(""+name+" the "+type+" jumps over "+a.getName()+" the "+a.getType()+" ");
        }
        else 
            System.out.println(""+name+" the "+type+" can't jump");
    }

    public boolean canJump(){
        return true;
    }
    public Size getSize(){
        return size;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
}