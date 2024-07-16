package NewPractice;


public class star_Pattern 
{
	public static void main(String[] Args)
	{
//		//normal star top
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//	
//		//normal star bottom
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
		
		//normal left start
//		for(int i=1;i<=5;i++)
//		{
//			//space given
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//		//normal left start bottom
//				for(int i=5;i>=1;i--)
//				{
//					//space given
//					for(int j=4;j>=i;j--)
//					{
//						System.out.print(" ");
//					}
//					for(int k=1;k<=i;k++)
//					{
//						System.out.print("*");
//					}
//					System.out.println(" ");
//				}
		//top bottom pyramid
//				for(int i=1;i<=5;i++)
//					{
//						//space given
//						for(int j=4;j>=i;j--)
//						{
//							System.out.print(" ");
//						}
//						for(int k=1;k<=i;k++)
//						{
//							System.out.print("* ");
//						}
//						System.out.println(" ");
//					}
//				
//							for(int i=4;i>=1;i--)
//							{
//								//space given
//								for(int j=4;j>=i;j--)
//								{
//									System.out.print(" ");
//								}
//								for(int k=1;k<=i;k++)
//								{
//									System.out.print("* ");
//								}
//								System.out.println(" ");
//							}
//		
//		//top arrow
//		for(int i=5;i>=1;i--)
//			{
//			//space given
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//				for(int k=1;k<=i;k++)
//				{
//					if (i==k)
//					{
//						System.out.print("* ");
//					}
//				}
//				System.out.println(" ");
//			}
		
//		//down arrow
//				for(int i=1;i<=5;i++)
//					{
//					//space given
//					for(int j=4;j>=i;j--)
//					{
//						System.out.print(" ");
//					}
//						for(int k=1;k<=i;k++)
//						{
//							if (i==k)
//							{
//								System.out.print("* ");
//							}
//						}
//						System.out.println(" ");
//					}
				
				//Entirearrow
				for(int i=5;i>=1;i--)
					{
					//space given
					for(int j=4;j>=i;j--)
					{
						System.out.print(" ");
					}
						for(int k=1;k<=i;k++)
						{
							if (i==k)
							{
								System.out.print("* ");
							}
						}
						System.out.println(" ");
					}
				
						for(int i=1;i<=5;i++)
							{
							//space given
							for(int j=4;j>=i;j--)
							{
								System.out.print(" ");
							}
								for(int k=1;k<=i;k++)
								{
									if (i==k)
									{
										System.out.print("* ");
									}
								}
								System.out.println(" ");
							}
						
						
				
		
				
	}

}