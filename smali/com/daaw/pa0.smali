.class public final synthetic Lcom/daaw/pa0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/qa0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qa0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pa0;->a:Lcom/daaw/qa0;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/pa0;->a:Lcom/daaw/qa0;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/qa0;->a0(Z)V

    return-void
.end method
