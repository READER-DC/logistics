package entity;

import java.util.ArrayList;

public class Matrix {
	private String subgroup_name;
	private String group_name;
	private String sub_category;
	private String category;
	private String sku;
	private int item_code;
	private int store_code;
	private String store_name;
	private String cooperation_scheme;
	private String format;
	private int on_the_road;
	private int stock;
	private int min_matrix;
	private int max_matrix;
	private int adress;
	private int bz;
	private String assortment_type;
	private String date_in;
	private String date_out;
	private int sold_in14days;
	private int promotion;
	private int stock_substitute;
	private int on_the_road_substitute;
	private int bzh;
	
	public static ArrayList<Matrix> arrayListMatrix = new ArrayList<Matrix>();

	private Matrix(String subgroup_name, String group_name, String sub_category, String category, String sku,
			int item_code, int store_code, String store_name, String cooperation_scheme, String format, int on_the_road,
			int stock, int min_matrix, int max_matrix, int adress, int bz, String assortment_type, String date_in,
			String date_out, int sold_in14days, int promotion, int stock_substitute, int on_the_road_substitute,
			int bzh) {
		super();
		this.subgroup_name = subgroup_name;
		this.group_name = group_name;
		this.sub_category = sub_category;
		this.category = category;
		this.sku = sku;
		this.item_code = item_code;
		this.store_code = store_code;
		this.store_name = store_name;
		this.cooperation_scheme = cooperation_scheme;
		this.format = format;
		this.on_the_road = on_the_road;
		this.stock = stock;
		this.min_matrix = min_matrix;
		this.max_matrix = max_matrix;
		this.adress = adress;
		this.bz = bz;
		this.assortment_type = assortment_type;
		this.date_in = date_in;
		this.date_out = date_out;
		this.sold_in14days = sold_in14days;
		this.promotion = promotion;
		this.stock_substitute = stock_substitute;
		this.on_the_road_substitute = on_the_road_substitute;
		this.bzh = bzh;
	}

	public static void createMatrix(String subgroup_name, String group_name, String sub_category, String category, String sku,
			int item_code, int store_code, String store_name, String cooperation_scheme, String format, int on_the_road,
			int stock, int min_matrix, int max_matrix, int adress, int bz, String assortment_type, String date_in,
			String date_out, int sold_in14days, int promotion, int stock_substitute, int on_the_road_substitute,
			int bzh) {
		
		Matrix matrix = new Matrix(subgroup_name, group_name, sub_category, category, sku,
				item_code, store_code, store_name, cooperation_scheme, format, on_the_road,
				stock, min_matrix, max_matrix, adress, bz, assortment_type, date_in,
				date_out, sold_in14days, promotion, stock_substitute, on_the_road_substitute,
				bzh);
		
		arrayListMatrix.add(matrix);
	}

	public String getSubgroup_name() {
		return subgroup_name;
	}

	public void setSubgroup_name(String subgroup_name) {
		this.subgroup_name = subgroup_name;
	}

	public String getSub_category() {
		return sub_category;
	}

	public void setSub_category(String sub_category) {
		this.sub_category = sub_category;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	public int getStore_code() {
		return store_code;
	}

	public void setStore_code(int store_code) {
		this.store_code = store_code;
	}

	public int getStock_substitute() {
		return stock_substitute;
	}

	public void setStock_substitute(int stock_substitute) {
		this.stock_substitute = stock_substitute;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getSold_in14days() {
		return sold_in14days;
	}

	public void setSold_in14days(int sold_in14days) {
		this.sold_in14days = sold_in14days;
	}

	public int getPromotion() {
		return promotion;
	}

	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}

	public int getOn_the_road_substitute() {
		return on_the_road_substitute;
	}

	public void setOn_the_road_substitute(int on_the_road_substitute) {
		this.on_the_road_substitute = on_the_road_substitute;
	}

	public int getOn_the_road() {
		return on_the_road;
	}

	public void setOn_the_road(int on_the_road) {
		this.on_the_road = on_the_road;
	}

	public int getMin_matrix() {
		return min_matrix;
	}

	public void setMin_matrix(int min_matrix) {
		this.min_matrix = min_matrix;
	}

	public int getMax_matrix() {
		return max_matrix;
	}

	public void setMax_matrix(int max_matrix) {
		this.max_matrix = max_matrix;
	}

	public int getItem_code() {
		return item_code;
	}

	public void setItem_code(int item_code) {
		this.item_code = item_code;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getDate_out() {
		return date_out;
	}

	public void setDate_out(String date_out) {
		this.date_out = date_out;
	}

	public String getDate_in() {
		return date_in;
	}

	public void setDate_in(String date_in) {
		this.date_in = date_in;
	}

	public String getCooperation_scheme() {
		return cooperation_scheme;
	}

	public void setCooperation_scheme(String cooperation_scheme) {
		this.cooperation_scheme = cooperation_scheme;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAssortment_type() {
		return assortment_type;
	}

	public void setAssortment_type(String assortment_type) {
		this.assortment_type = assortment_type;
	}

	public int getAdress() {
		return adress;
	}

	public void setAdress(int adress) {
		this.adress = adress;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getBzh() {
		return bzh;
	}

	public void setBzh(int bzh) {
		this.bzh = bzh;
	}

	public int getBz() {
		return bz;
	}

	public void setBz(int bz) {
		this.bz = bz;
	}

	
	
}
