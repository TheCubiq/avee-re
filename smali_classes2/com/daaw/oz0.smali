.class public abstract Lcom/daaw/oz0;
.super Lcom/daaw/qz0;
.source ""

# interfaces
.implements Lcom/daaw/fi0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/daaw/qz0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lcom/daaw/fi0;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/daaw/ci0;
    .locals 1

    invoke-static {p0}, Lcom/daaw/m31;->c(Lcom/daaw/oz0;)Lcom/daaw/fi0;

    move-result-object v0

    return-object v0
.end method
