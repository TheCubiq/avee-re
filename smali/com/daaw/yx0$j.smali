.class public Lcom/daaw/yx0$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yx0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/tw1$a<",
        "Landroid/content/Context;",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Lcom/daaw/al;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/yx0;


# direct methods
.method public constructor <init>(Lcom/daaw/yx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yx0$j;->a:Lcom/daaw/yx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Lcom/daaw/al;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/yx0$j;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/al;)V

    return-void
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/al;)V
    .locals 0

    iget-object p4, p0, Lcom/daaw/yx0$j;->a:Lcom/daaw/yx0;

    invoke-static {p4, p1, p2, p3}, Lcom/daaw/yx0;->d(Lcom/daaw/yx0;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
