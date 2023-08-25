.class public final synthetic Lcom/daaw/ly0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/my0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/my0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ly0;->a:Lcom/daaw/my0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ly0;->a:Lcom/daaw/my0;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Long;

    check-cast p3, Ljava/lang/Boolean;

    invoke-static {v0, p1, p2, p3}, Lcom/daaw/my0;->b(Lcom/daaw/my0;ZLjava/lang/Long;Ljava/lang/Boolean;)V

    return-void
.end method
