    return (x + width < 0);
  }
}
  
//PowerUp
//  
//Score
//  

 
class WorldGenerator {
  
  private static double probabilityOfPipe = 0.05;
  private static int timeToNextPipe = 0;
  
  public static GameObject[] generate() {
    timeToNextPipe--;
    if (timeToNextPipe <= 0 && Math.random() < probabilityOfPipe) {
      GameObject[] genObjs = new GameObject[2];
      double startY = Math.random()/2+0.2;
      double endY = startY + Game.GAP_HEIGHT;
      genObjs[0] = new Pipe(1, endY, Direction.UP);
      genObjs[1] = new Pipe(1, startY, Direction.DOWN);
      timeToNextPipe = 50;
      return genObjs;
    } else {
      return null;
    }
  }
}
  
class Game {
    public static final double GROUND_Y = 0.2;
    public static final double GRAVITY = 0.001;
    public static final double OBJECT_SPEED = 0.01;
    public static final double GAP_HEIGHT = 0.3;
}
