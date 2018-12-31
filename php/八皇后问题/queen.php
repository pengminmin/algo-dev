<?php
/**
 * 八皇后问题
 * Class Queen
 */
class Queen {
  private $max;
	private $arr = array();
	private $count = 0;

    public function __construct($max = 8){
        $this->max = $max;
		for($i=0; $i<$this->max; $i++){
			for($j=0; $j<$this->max; $j++){
				$this->arr[$i][$j] = 0;
			}
		}
        $this->loop();
	}

	private function check($x, $y){
		for($i=0; $i < $y; $i++){
			//检查纵向
			if($this->arr[$x][$i] == 1){
				return false;
			}
			//检查左侧斜向
			if($x-1-$i >= 0 && $this->arr[$x-1-$i][$y-1-$i] == 1){
				return false;
			}
			//检查右侧斜向
			if($x+1+$i < $this->max && $this->arr[$x+1+$i][$y-1-$i] == 1){
				return false;
			}
		}
		return true;
	}

	private function loop($y = 0){
		if($y == $this->max){
			return true;
		}
		for($i=0; $i<$this->max; $i++){
			for($x=0; $x<$this->max; $x++){
				$this->arr[$x][$y] = 0;
			}
			if($this->check($i, $y)){
				$this->arr[$i][$y] = 1;
				if($this->loop($y+1)){
					$this->show();
				}
			}
		}
		return false;
	}

	private function show(){
		$this->count++;
		echo "解答";
		echo $this->count;
		echo "<br/>";
		foreach($this->arr as $value){
			foreach($value as $v){
				echo $v;
				echo " ";
			}
			echo "<br/>";
		}
		echo "<br/>";
	}
}
$queen = new Queen();
