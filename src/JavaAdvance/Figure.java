package JavaAdvance;

public class Figure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block blk =new Block(1, 2, 3);
		System.out.println(blk.toString());

	}

}

class Rectangle{
	
	int length,width;
	
	Rectangle(){
		
	}
	Rectangle(int l, int w){
		this.length=l;
		this.width=w;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public String toString() {
		
		return " length-"+this.length+" width-"+this.width;
	}
}

class Block extends Rectangle{
	int height;
	Block(){
		
	}
	Block(int l,int w, int h){
		super(l,w);
		this.height=h;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString() {
		return super.toString()+" Height-"+this.height;
	}
	
}
