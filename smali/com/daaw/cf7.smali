.class public abstract Lcom/daaw/cf7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cf7;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public abstract a(Lcom/daaw/xt7;)Ljava/lang/Object;
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/daaw/cf7;->a:Ljava/lang/Class;

    return-object v0
.end method
