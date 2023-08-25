.class public Lcom/daaw/j7$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/j7;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Lcom/daaw/al;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/j7;


# direct methods
.method public constructor <init>(Lcom/daaw/j7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j7$b;->a:Lcom/daaw/j7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/al;)V
    .locals 0

    invoke-static {p1}, Lcom/daaw/qx;->q(Lcom/daaw/al;)Lcom/daaw/qx;

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/al;

    invoke-virtual {p0, p1}, Lcom/daaw/j7$b;->a(Lcom/daaw/al;)V

    return-void
.end method
