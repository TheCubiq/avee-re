.class public Lcom/daaw/avee/Common/SimpleListConstantInt;
.super Ljava/lang/Object;
.source "SimpleListConstantInt.java"

# interfaces
.implements Lcom/daaw/avee/Common/ISimpleListInt;


# instance fields
.field size:I

.field value:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput p1, p0, Lcom/daaw/avee/Common/SimpleListConstantInt;->value:I

    .line 15
    iput p2, p0, Lcom/daaw/avee/Common/SimpleListConstantInt;->size:I

    return-void
.end method


# virtual methods
.method public get(I)I
    .locals 0

    .line 25
    iget p1, p0, Lcom/daaw/avee/Common/SimpleListConstantInt;->value:I

    return p1
.end method

.method public size()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/daaw/avee/Common/SimpleListConstantInt;->size:I

    return v0
.end method
