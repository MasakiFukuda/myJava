class PrintInfo{
	private int count1;
	private int count2;
	private String moji;
	
	public PrintInfo(int count1,int count2,String moji){
		this.count1 = count1;
		this.count2 = count2;
		this.moji = moji;
	}
	
	public int getCount1(){
		return count1;
	}
	
	public int getCount2(){
		return count2;
	}
	
	public String getMoji(){
		return moji;
	}
}

class PrintOut{
	private PrintInfo p;  
	
	public PrintOut(int count1,int count2,String moji){
		p = new PrintInfo(count1,count2,moji);
	}
	
	public void output(){
		for(int i = 0;i < p.getCount1();i++){
			for(int j = 0;j < p.getCount2();j++){
				System.out.print(p.getMoji()+" ");
			}
			
			System.out.println();
		}
	}
}

class ysys{
	public static void main(String[] args){
		try{
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			PrintOut p = new PrintOut(i,j,args[2]);
			
			p.output();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("コマンドライン引数の与え方が不正です");
			System.out.println("出力行数 出力列数 出力文字列の順に入力してください");
		}finally{
			System.out.println("終了");
		}
		
	}
}
