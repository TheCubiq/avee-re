.class public final synthetic Lcom/daaw/m1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/r1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/m1;->a:Lcom/daaw/r1;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/m1;->a:Lcom/daaw/r1;

    invoke-static {v0}, Lcom/daaw/r1;->h(Lcom/daaw/r1;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
