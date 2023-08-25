.class public final Lcom/daaw/rw0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Z

.field public final b:Landroid/content/res/Configuration;


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/daaw/rw0;->a:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/rw0;->b:Landroid/content/res/Configuration;

    return-void
.end method

.method public constructor <init>(ZLandroid/content/res/Configuration;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/daaw/rw0;->a:Z

    iput-object p2, p0, Lcom/daaw/rw0;->b:Landroid/content/res/Configuration;

    return-void
.end method
