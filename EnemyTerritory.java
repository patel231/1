public class EnemyTerritory extends MapTile {
    private Enemy enemy;

    public EnemyTerritory(int x, int y, Enemy enemy ){
        super(x, y);
        this.enemy = enemy;
    }
    public void modify_player(Player the_player){
        if (enemy.is_alive()){
            the_player.hp = the_player.hp - enemy.damage;

            System.out.printf("Enemy dose  %d damage, You have %d HP remaining.", enemy.damage, the_player.hp);
        }
    }
}
