import javax.xml.stream.Location;

public abstract class Tower extends Entity implements Actor
{

private Location loc; 
private int range;
private int damage;
private int fireRate;
private double cost; 


	
	
	public Tower()
	{
		damage = 10;
		fireRate = 1; 
		range = 8;
		cost = 200;
		
		
	}
	
	public void act() 
	{
		  ArrayList<Location> gr = getGrid().getOccupiedAdjacentLocations(getLocation());
          
		  ArrayList<Enemy> a = new ArrayList<Enemy>();
		  
          for(int k = 0; k < gr.size(); k++)
          {
              if(getGrid().get(gr.get(k)) instanceof Enemy) 
              {
                      a.add((Enemy)(getGrid().get(gr.get(k))));
              }
             
          }
          if(a.size > 0)
          {
        	  int time = fireRate
        	  fireRate--; 
        	  if(fireRate == 0){
        	  attack();
        	  fireRate = time; 
        	  }
        	  
          }
          
      }
		
		
	
	public attack()
	{
		 ArrayList<Location> gr = getGrid().getOccupiedAdjacentLocations(getLocation());
         
		  ArrayList<Enemy> a = new ArrayList<Enemy>();
		  
         for(int k = 0; k < gr.size(); k++)
         {
             if(getGrid().get(gr.get(k)) instanceof Enemy) 
             {
                     a.add((Enemy)(getGrid().get(gr.get(k))));
             }
            
         }
         
        for(int i = 0; i <a.size(); i++)
        {
        	//decrease health of enemy based on damage
        	
        	
        	
        	
        }
     }
		
		
		
		
	}
	public double getCost()
	{
		return cost; 
		
	}
	public setCost(double cost)
	{
		 this.cost = cost; 
		
	}
	public int getDamage()
	{
		return damage;
		
	}
	public void setDamage(int damage)
	{
		 this.damage = damage;
		
	} 
	public int fireRate()
	{
		return fireRate;
		
	}
	public void setFireRate(int firerate)
	{
		 this.fireRate = firerate;
		
	}
	
	
}
