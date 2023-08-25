.class public Lcom/daaw/ha1$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ie0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ha1$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/daaw/ha1$b;

.field public final synthetic b:Lcom/daaw/ha1$b;


# direct methods
.method public constructor <init>(Lcom/daaw/ha1$b;Lcom/daaw/ha1$b;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ha1$b$a;->b:Lcom/daaw/ha1$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/ha1$b$a;->a:Lcom/daaw/ha1$b;

    return-void
.end method


# virtual methods
.method public get(I)D
    .locals 3

    iget-object v0, p0, Lcom/daaw/ha1$b$a;->a:Lcom/daaw/ha1$b;

    iget-object v0, v0, Lcom/daaw/ha1$b;->U:[D

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ha1$b$a;->a:Lcom/daaw/ha1$b;

    iget-object v0, v0, Lcom/daaw/ha1$b;->U:[D

    array-length v0, v0

    return v0
.end method
