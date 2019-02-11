<?php
/**
* $monkeys 是猴子数组
* $n 数到第n个删除
*
*/
function killMonkey($monkeys, $n, $current = 0){
  $number = count($monkeys);
  if($number == 1){
    echo $monkeys[0] . "成为猴王";
    return;
  }else{
    for($i=1;$i<$n;$i++){
      $current++;
      $current = $current%$number;
    }
    echo $monkeys[$current] . "被删除了<br/>";
    //array_splice 返回一个包含有被移除单元的数组。
    array_splice($monkeys, $current, 1);
    killMonkey($monkeys, $n, $current);
  }
}

$monkeys = range(1, 10);
killMonkey($monkeys, 3);
