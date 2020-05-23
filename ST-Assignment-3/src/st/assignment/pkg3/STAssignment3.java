package st.assignment.pkg3;

/**
 *
 * @author abdulrahman
 */
public class STAssignment3 {

    public static float caluculateKDA(int kill, int death, int assist) 
    {
	int flag1 = 0,flag2 =0, flag3=0;
	int k = 0, d = 0, a = 0;
	float ratioKDA = 0;
	if (kill>=15 && kill<=30)
	{
		k = kill;
		flag1 = 1;
	}
	if (death >= 0 && death <= 6)
	{
		d = death;
		flag2 = 1;
	}
	if (assist>=0 && assist<=10) 
	{
		a = assist;
		flag3 = 1;
	}
	if (flag1 == 1 && flag2 == 1 && flag3 == 1)
	{
		if (death != 0)
			ratioKDA = (kill + assist) / death;
		else
			System.out.println("invalid" );
	}
	else {
		System.out.println("Not valid for given condition" );
	}
	return ratioKDA;
    }
    public static float baronDragonRatio(int baron, int dragon)
    {
	int b = 0, d = 0;
	int flag1 = 0, flag2 = 0;
	float ratioBD = 0;
	if (baron>=0 && baron<=3) 
	{
		b = baron;
		flag1 = 1;
	}
	if (dragon >= 0 && dragon <= 4)
	{
		d = dragon;
		flag2 = 1;
	}
	if (flag1 == 1 && flag2 == 1)
	{
		ratioBD = (baron+dragon) / 2;
	}
	else {
		System.out.println("Not valid for given condition");
	}
	return ratioBD;
    }
    public static void rankCalculation(float KDA, float BD)
    {
	int flag1 = 0, flag2 = 0;
	if (KDA >= 6 && KDA <= 20)
	{
		flag1 = 1;
	}
	if (BD >= 1 && BD <= 3)
	{
		flag2 = 1;
	}
	if (flag1 == 1 && flag2 == 1)
	{
            System.out.println("Congratulations You Have Achieved Diamond Rank.");
	}
	else
	{
            System.out.println("Sorry! you were unsuccessful to achieve Diamond Rank.");
		
	}
    }
    public static void main(String[] args) {
        int kill = 19, death = 3, assist = 8, baron = 2, dragon = 3,flag1=0,flag2=0;
	float kda = 0, bd = 0;
        System.out.println("Current Rank!");
	System.out.println("IGN: Player");
	System.out.println("Current Rank: Platinum");
	System.out.println("Series: Promos Series to Diamond");
	System.out.println("");
	kda = caluculateKDA(kill, death, assist);
	bd = baronDragonRatio(baron, dragon);
	System.out.println("Calculating . . . .");
	System.out.println("Successfully Caculated !!!");
	System.out.println("");
	if (kda >= 2 && kda <= 33)
	{
		flag1 = 1;
	}
	if (bd >= 0 && bd <= 3)
	{
		flag2 = 1;
	}
	if (flag1 == 1 && flag2 == 1)
	{
		rankCalculation(kda, bd);
		System.out.println("");
                System.out.println("Updated Rank!");
                System.out.println("");
		System.out.println("IGN: Player");
		System.out.println("Current Rank: Diamond");
	}
	else {
		System.out.println("Kda ratio or BD ratio wasn't in the range from the given condition");
	}
    }
    
}
