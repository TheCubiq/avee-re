.class public Lcom/daaw/v70$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/v70;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/v70$a$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/daaw/v70$a;


# instance fields
.field public final a:Lcom/daaw/vf1;

.field public final b:Landroid/os/Looper;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/v70$a$a;

    invoke-direct {v0}, Lcom/daaw/v70$a$a;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/v70$a$a;->a()Lcom/daaw/v70$a;

    move-result-object v0

    sput-object v0, Lcom/daaw/v70$a;->c:Lcom/daaw/v70$a;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/vf1;Landroid/accounts/Account;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/v70$a;->a:Lcom/daaw/vf1;

    iput-object p3, p0, Lcom/daaw/v70$a;->b:Landroid/os/Looper;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/vf1;Landroid/accounts/Account;Landroid/os/Looper;Lcom/daaw/q12;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/v70$a;-><init>(Lcom/daaw/vf1;Landroid/accounts/Account;Landroid/os/Looper;)V

    return-void
.end method
