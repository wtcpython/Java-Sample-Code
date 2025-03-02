package com.wtc.landlord;

public enum PokerType {
    UnablePutCard, // 无法出牌
    SingleCard, // 单张牌
    PairCard, // 对子
    ThreeSame, // 3 张相同的牌
    Bomb, // 炸弹
    ThreeWithOne, // 三带一
    ThreeWithTwo, // 三带二
    FourWithTwo, // 四带二
    FourWithDoubleTwo, // 四带两对
    Straight, // 顺子
    PairStraight, // 连对
    Plane, // 飞机
    PlaneWidthSingle, // 飞机带单排
    PlaneWithPair // 飞机带对子
}
