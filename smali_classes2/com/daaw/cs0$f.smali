.class public Lcom/daaw/cs0$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cs0$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/cs0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/cs0$f;->a:I

    iput p2, p0, Lcom/daaw/cs0$f;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/daaw/cs0$f;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/daaw/cs0$f;->a:I

    return v0
.end method
