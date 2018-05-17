public abstract class Tower extends Entity implements Actor
{

private Location loc; 
private int range;
private int damage;
Private int fireRate;
Private double cost; 

	
	public Tower(int damage , int fireRate, int range, double cost, Location loc)
	{
		this.damage = damage;
		this.fireRate = fireRate; 
		this.range = range;
		this.cost = cost;
		this.loc = loc; 
		
		
		
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
		
		
	}
	public void attack()
	{
		
		
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
	public Location getLoc()
	{
	return loc;
	}
	public void setLoc(Location loc)
	{
	this.loc = loc; 
	}
