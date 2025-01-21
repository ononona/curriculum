package logic;

import java.util.Random;

public class Character {
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;

	// コンストラクタ
	public Character(String name) {
		this.name = name;
		generateRandomStats();
	}

	// ステータスをランダムに表示する
	private void generateRandomStats() {
		Random random = new Random();
		this.hp = random.nextInt(1000) + 1; // HP: 1〜1000
		this.mp = random.nextInt(1000) + 1; // MP: 1〜1000
		this.attack = random.nextInt(500) + 1; // 攻撃力: 1〜500
		this.speed = random.nextInt(1000) + 1; // 素早さ: 1〜1000
		this.defense = random.nextInt(100) + 1; // 防御力: 1〜100
	}

	// ゲッターとセッターを使用する
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public int getAttack() {
		return attack;
	}

	public int getSpeed() {
		return speed;
	}

	public int getDefense() {
		return defense;
	}
}