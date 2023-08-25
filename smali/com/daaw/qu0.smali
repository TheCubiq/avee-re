.class public interface abstract Lcom/daaw/qu0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/qu0$b;
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/qu0$b$c;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation
.end field

.field public static final b:Lcom/daaw/qu0$b$b;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/qu0$b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/qu0$b$c;-><init>(Lcom/daaw/qu0$a;)V

    sput-object v0, Lcom/daaw/qu0;->a:Lcom/daaw/qu0$b$c;

    new-instance v0, Lcom/daaw/qu0$b$b;

    invoke-direct {v0, v1}, Lcom/daaw/qu0$b$b;-><init>(Lcom/daaw/qu0$a;)V

    sput-object v0, Lcom/daaw/qu0;->b:Lcom/daaw/qu0$b$b;

    return-void
.end method
