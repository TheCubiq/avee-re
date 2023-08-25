.class public final synthetic Lcom/daaw/b60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xw1$a;


# static fields
.field public static final synthetic a:Lcom/daaw/b60;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/b60;

    invoke-direct {v0}, Lcom/daaw/b60;-><init>()V

    sput-object v0, Lcom/daaw/b60;->a:Lcom/daaw/b60;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/al;

    check-cast p2, Landroid/content/Intent;

    invoke-static {p1, p2}, Lcom/daaw/c60;->b(Lcom/daaw/al;Landroid/content/Intent;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
