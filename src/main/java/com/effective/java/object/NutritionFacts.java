package com.effective.java.object;

//@SuppressWarnings("unused")
//public class NutritionFacts {
//
//	private final int servingSize; // (mL) required
//	private final int servings; // (per container) required
//	private final int calories; // optional
//	private final int fat; // (g) optional
//	private final int sodium; // (mg) optional
//	private final int carbohydrate; // (g) optional
//
//	public NutritionFacts(int servingSize, int servings) {
//		this(servingSize, servings, 0);
//	}
//
//	public NutritionFacts(int servingSize, int servings, int calories) {
//		this(servingSize, servings, calories, 0);
//	}
//
//	public NutritionFacts(int servingSize, int servings, int calories, int fat) {
//		this(servingSize, servings, calories, fat, 0);
//	}
//
//	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
//		this(servingSize, servings, calories, fat, sodium, 0);
//	}
//
//	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
//		this.servingSize = servingSize;
//		this.servings = servings;
//		this.calories = calories;
//		this.fat = fat;
//		this.sodium = sodium;
//		this.carbohydrate = carbohydrate;
//	}
//	
//	//调用
//	public static void main(String[] args) {
//		NutritionFacts cocaCola =new NutritionFacts(240, 8, 100, 0, 35, 27);
//	}
//
//}

//@SuppressWarnings("unused")
//public class NutritionFacts {
//	// Parameters initialized to default values (if any)
//	private int servingSize = -1; // Required; no default value
//	private int servings = -1; // " " " "
//	private int calories = 0;
//	private int fat = 0;
//	private int sodium = 0;
//	private int carbohydrate = 0;
//
//	public NutritionFacts() {
//	}
//
//	// Setters
//	public void setServingSize(int val) {
//		servingSize = val;
//	}
//
//	public void setServings(int val) {
//		servings = val;
//	}
//
//	public void setCalories(int val) {
//		calories = val;
//	}
//
//	public void setFat(int val) {
//		fat = val;
//	}
//
//	public void setSodium(int val) {
//		sodium = val;
//	}
//
//	public void setCarbohydrate(int val) {
//		carbohydrate = val;
//	}
//
//	public static void main(String[] args) {
//		NutritionFacts cocaCola = new NutritionFacts();
//		cocaCola.setServingSize(240);
//		cocaCola.setServings(8);
//		cocaCola.setCalories(100);
//		cocaCola.setSodium(35);
//		cocaCola.setCarbohydrate(27);
//	}
//}

//Builder模式十分灵活，可以利用单个builder构建多个对象。builder的参数可以在创建对象期间进行调整，也可以随着不同的对象而改变

@SuppressWarnings("unused")
public class NutritionFacts {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static class Builder {
		// required parameters
		private final int servingSize;
		private final int servings;
		// optional paramters-initialized to default values;
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			this.fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			this.carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			this.sodium = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	public static void main(String[] args) {
		NutritionFacts instance = new NutritionFacts.Builder(240, 8).calories(2).build();
	}
}
