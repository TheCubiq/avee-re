.class public abstract Lcom/daaw/xd7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/dq7;

.field public final b:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dq7;Ljava/lang/Class;Lcom/daaw/wd7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xd7;->a:Lcom/daaw/dq7;

    iput-object p2, p0, Lcom/daaw/xd7;->b:Ljava/lang/Class;

    return-void
.end method

.method public static b(Lcom/daaw/sd7;Lcom/daaw/dq7;Ljava/lang/Class;)Lcom/daaw/xd7;
    .locals 1

    new-instance v0, Lcom/daaw/rd7;

    invoke-direct {v0, p1, p2, p0}, Lcom/daaw/rd7;-><init>(Lcom/daaw/dq7;Ljava/lang/Class;Lcom/daaw/sd7;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Lcom/daaw/gf7;Lcom/daaw/x97;)Lcom/daaw/m87;
    .param p2    # Lcom/daaw/x97;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public final c()Lcom/daaw/dq7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xd7;->a:Lcom/daaw/dq7;

    return-object v0
.end method

.method public final d()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xd7;->b:Ljava/lang/Class;

    return-object v0
.end method
