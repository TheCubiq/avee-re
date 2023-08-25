.class public Lcom/daaw/y21$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/y21;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/y21;


# direct methods
.method public constructor <init>(Lcom/daaw/y21;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/y21$a;->p:Lcom/daaw/y21;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/y21$a;->p:Lcom/daaw/y21;

    invoke-virtual {v0}, Lcom/daaw/y21;->x()V

    return-void
.end method
