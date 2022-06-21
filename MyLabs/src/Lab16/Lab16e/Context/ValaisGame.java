package Lab16.Lab16e.Context;


import Lab16.Lab16e.Strategy.StrategyGame;

public  class ValaisGame  {
    public StrategyGame gameStragegy;

    public void setGameStragegy(StrategyGame gameStragegy) {
        this.gameStragegy = gameStragegy;
    }

    public void end() {
        gameStragegy.end();
    }

    public void move() {
        gameStragegy.move();
    }

    public void setWinner(){
        gameStragegy.setWinner();
    }

}
