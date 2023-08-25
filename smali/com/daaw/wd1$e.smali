.class public Lcom/daaw/wd1$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wd1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/tw1$a<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Integer;",
        "Ljava/util/Date;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/wd1;


# direct methods
.method public constructor <init>(Lcom/daaw/wd1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wd1$e;->a:Lcom/daaw/wd1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/util/Date;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/wd1$e;->b(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/Date;Ljava/lang/Boolean;)V
    .locals 1

    invoke-static {}, Lcom/daaw/td1;->c()Lcom/daaw/td1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/td1;->b(ZILjava/util/Date;Z)V

    return-void
.end method
