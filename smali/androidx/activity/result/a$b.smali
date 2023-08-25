.class public Landroidx/activity/result/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/result/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/u0<",
            "TO;>;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/v0<",
            "*TO;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/u0;Lcom/daaw/v0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/u0<",
            "TO;>;",
            "Lcom/daaw/v0<",
            "*TO;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/result/a$b;->a:Lcom/daaw/u0;

    iput-object p2, p0, Landroidx/activity/result/a$b;->b:Lcom/daaw/v0;

    return-void
.end method
