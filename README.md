# Java の例外処理を学習する

## 例外の握りつぶし
例外を握りつぶすと不具合調査が大変になることを知る。

[検証方法]  
Employee#notifyHashCode メソッドの throw 句をコメントアウトしたら、どうなるかを確認する。

## Throwable(Exception) と RuntimeException の違いを知る
throws 句が使えるのは、Throwable を継承した Exception のほうだと知っておく。

## 自作例外を実装できるようにしておく

## 最上流で下流の例外をキャッチする方法を知る
