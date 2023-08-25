.class public Lcom/daaw/je1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/je1;->d(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/sd0;

.field public final synthetic b:Lcom/daaw/je1;


# direct methods
.method public constructor <init>(Lcom/daaw/je1;Lcom/daaw/sd0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/je1$b;->b:Lcom/daaw/je1;

    iput-object p2, p0, Lcom/daaw/je1$b;->a:Lcom/daaw/sd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/je1$b;->b:Lcom/daaw/je1;

    iget-object p2, p0, Lcom/daaw/je1$b;->a:Lcom/daaw/sd0;

    const/4 v0, -0x1

    invoke-static {p1, v0, p2}, Lcom/daaw/je1;->a(Lcom/daaw/je1;ILcom/daaw/sd0;)V

    return-void
.end method
