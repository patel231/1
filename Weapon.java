public class Weapon extends Item{


    int damage;
    int duration;


    public int getDamage(){
        return damage;
    }
    public void setDamage(){
        this.damage = damage;
    }
    public Weapon(String name, int value, int damage){
        super(name,value);
        this.damage = damage;
    }
    public Weapon(String name,String des, int value, int damage){
        super(name,des,value);
        this.damage = damage;
    }

    public Weapon(String name, int duration){
        super(name,duration);
        this.duration = duration;
    }


    public String Str(){
        return String.format("{0}\n=====\n{1}\nvalue: {2}\n Damage: {3}", this.name, this.value, this.damage);
    }

    public Object getName() {
        return null;
    }
}
