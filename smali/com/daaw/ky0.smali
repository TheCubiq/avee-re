.class public final synthetic Lcom/daaw/ky0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/my0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/my0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ky0;->a:Lcom/daaw/my0;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ky0;->a:Lcom/daaw/my0;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/daaw/my0;->a(Lcom/daaw/my0;Ljava/lang/Boolean;)V

    return-void
.end method
