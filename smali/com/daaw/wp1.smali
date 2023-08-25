.class public final synthetic Lcom/daaw/wp1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ri1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/eq1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/eq1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wp1;->a:Lcom/daaw/eq1;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wp1;->a:Lcom/daaw/eq1;

    invoke-static {v0}, Lcom/daaw/eq1;->i(Lcom/daaw/eq1;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
