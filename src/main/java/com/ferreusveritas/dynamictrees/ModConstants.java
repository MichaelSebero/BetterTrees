package com.ferreusveritas.dynamictrees;

public class ModConstants {

	public static final String MODID = "dynamictrees";
	public static final String NAME = "Dynamic Trees";
	public static final String VERSION = "1.12.2-9999.9999.9999z"; // Assigned from gradle during compile, do not change!

	public static final String OPTAFTER = "after:";
	public static final String OPTBEFORE = "before:";
	public static final String REQAFTER = "required-after:";
	public static final String REQBEFORE = "required-before:";
	public static final String NEXT = ";";
	public static final String AT = "@[";
	public static final String GREATERTHAN = "@(";
	public static final String ORGREATER = ",)";

	public static final String SERENESEASONS = "sereneseasons";

	//Other mods can use this string to depend on the latest version of Dynamic Trees
	public static final String DYNAMICTREES_LATEST = MODID + AT + VERSION + ORGREATER;

	//Other Add-on Mods
	public static final String DYNAMICTREESBOP = "dynamictreesbop";
	public static final String DYNAMICTREESTC = "dynamictreestc";
	public static final String DYNAMICTREESPHC = "dynamictreesphc";
	public static final String DYNAMICTREESTRAVERSE = "dttraverse";
	public static final String DYNAMICTREESHNC = "dynamictreeshnc";
	public static final String RUSTIC = "rustic";

	//Other Mod Versions.. These have been added to avoid the whole "Duh.. How come my mod is crashing?" bullshit bug reports.
	public static final String DYNAMICTREESBOP_VER = AT + "1.12.2-1.4.3" + ORGREATER;
	public static final String DYNAMICTREESTC_VER = AT + "1.12.2-1.4.2" + ORGREATER;
	public static final String DYNAMICTREESPHC_VER = AT + "1.12.2-2.0.3" + ORGREATER;
	public static final String DYNAMICTREESTRAVERSE_VER = AT + "1.12.2-2.0" + ORGREATER;
	public static final String DYNAMICTREESHNC_VER = GREATERTHAN + "1.1" + ORGREATER;//Heat and Climate Add-on has not be updated in a while and the latest 1.1 is no longer supported
	public static final String RUSTIC_VER = GREATERTHAN + "1.0.14" + ORGREATER;
	public static final String RECURRENT_COMPLEX = "reccomplex";//Load after recurrent complex to allow it to generate it's content first

	//Forge
	private static final String FORGE = "forge";
	//public static final String FORGE_VER_NUM = "14.23.5.2768";
	public static final String FORGE_VER_NUM = "14.23.5.2847";
	public static final String FORGE_VER = FORGE + AT + FORGE_VER_NUM + ORGREATER;

	public static final String DEPENDENCIES
		= REQAFTER + FORGE_VER
		+ NEXT
		+ OPTBEFORE + RUSTIC + RUSTIC_VER
		+ NEXT
		+ OPTBEFORE + DYNAMICTREESBOP + DYNAMICTREESBOP_VER
		+ NEXT
		+ OPTBEFORE + DYNAMICTREESTC + DYNAMICTREESTC_VER
		+ NEXT
		+ OPTBEFORE + DYNAMICTREESPHC_VER + DYNAMICTREESPHC_VER
		+ NEXT
		+ OPTBEFORE + DYNAMICTREESTRAVERSE + DYNAMICTREESTRAVERSE_VER
		+ NEXT
		+ OPTBEFORE + DYNAMICTREESHNC + DYNAMICTREESHNC_VER
		+ NEXT
		+ OPTAFTER + RECURRENT_COMPLEX;

	public static final String CLIENT_PROXY = "com.ferreusveritas.dynamictrees.proxy.ClientProxy";
	public static final String COMMON_PROXY = "com.ferreusveritas.dynamictrees.proxy.CommonProxy";

	public static final String UPDATE_CHECKER = "https://github.com/DynamicTreesTeam/DynamicTreesVersionInfo/blob/master/DynamicTrees.json?raw=true";

}
