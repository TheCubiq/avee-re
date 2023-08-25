.class public final Lcom/daaw/qq$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vo$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/daaw/mp$a;

.field public final b:I


# direct methods
.method public constructor <init>(Lcom/daaw/mp$a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/daaw/qq$a;-><init>(Lcom/daaw/mp$a;I)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/mp$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qq$a;->a:Lcom/daaw/mp$a;

    iput p2, p0, Lcom/daaw/qq$a;->b:I

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/lk0;Lcom/daaw/wo;I[ILcom/google/android/exoplayer2/trackselection/c;IJZZLcom/daaw/ex0$c;)Lcom/daaw/vo;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/qq$a;->a:Lcom/daaw/mp$a;

    invoke-interface {v1}, Lcom/daaw/mp$a;->a()Lcom/daaw/mp;

    move-result-object v9

    new-instance v1, Lcom/daaw/qq;

    iget v12, v0, Lcom/daaw/qq$a;->b:I

    move-object v2, v1

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v8, p6

    move-wide/from16 v10, p7

    move/from16 v13, p9

    move/from16 v14, p10

    move-object/from16 v15, p11

    invoke-direct/range {v2 .. v15}, Lcom/daaw/qq;-><init>(Lcom/daaw/lk0;Lcom/daaw/wo;I[ILcom/google/android/exoplayer2/trackselection/c;ILcom/daaw/mp;JIZZLcom/daaw/ex0$c;)V

    return-object v1
.end method
